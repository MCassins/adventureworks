var administracaoerrorlog = angular.module('administracaoerrorlog', []);
administracaoerrorlog.controller('AppCtrl', ['$scope', '$http', function($scope, $http) {   

	var refresh = function(){
   	  $http.get('http://localhost:8080/Administracao/ErrorLog').then(doneCallbacks, failCallbacks);
		 function doneCallbacks(res) { 			
          $scope.errorlogs = res.data.lista;
			console.log(res.data.metodoEnvio);		
 		}

		 function failCallbacks(err) {
 			console.log(err.message);
 		}
	};

	
    refresh();


	$scope.adicionar = function() {    	
		$scope.lista.MetodoBase = parseFloat($scope.lista.MetodoBase);
		$scope.lista.MetodoRate = parseFloat($scope.lista.MetodoRate);
		console.log($scope.lista);		
		var dados = $scope.lista;		
		$http.post('http://osoriocomprasup3b.gear.host/api/MetodoDeEnvios/', dados).then(doneCallbacks, failCallbacks);
		 function doneCallbacks(res) { 			
 			alert('funfou!');
			refresh();
 		}

		 function failCallbacks(err) {
 			alert('naoooo funfou!');
			refresh();
 		}		
	};

	$scope.remover = function(id) {  
		console.log(id);
    	$http.delete('http://osoriocomprasup3b.gear.host/api/MetodoDeEnvios/' + id + '/').then(function(response){
   	     	refresh();
   	    });  	    
	};

	$scope.editar = function(id) {    
		console.log(id);			
    	$http.get('http://osoriocomprasup3b.gear.host/api/MetodoDeEnvios/' + id + '/').then(function(response){
   	     	$scope.lista = response.data;
   	    });  	    
	};	

	$scope.atualizar = function() {    
		console.log($scope.lista.MetodoEnvioID);	 
    	$http.put('http://osoriocomprasup3b.gear.host/api/MetodoDeEnvios/' + $scope.lista.MetodoEnvioID + '/', $scope.lista).then(function(response){
   	     	refresh();
   	    }); 			    
	};		
}]);