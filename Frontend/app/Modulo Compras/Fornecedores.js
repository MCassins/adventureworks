var myApp = angular.module('myApp', []);
myApp.controller('AppCtrl', ['$scope', '$http', function($scope, $http) {   

	var refresh = function(){
   	  $http.get('http://osoriocomprasup3b.gear.host/api/Fornecedores/').then(doneCallbacks, failCallbacks);
    
		 function doneCallbacks(res) { 			
 			$scope.livroslista = res.data.fornecedor;
 			$scope.lista = {};
			console.log(res.data.fornecedor);		
 		}

		 function failCallbacks(err) {
 			console.log(err.message);
 		}
	};

	refresh();

	$scope.addLivro = function() {    	
		$scope.lista.NumeroDaConta = parseFloat($scope.lista.NumeroDaConta);
		console.log($scope.lista);		
		var dados = $scope.lista;		
		$http.post('http://osoriocomprasup3b.gear.host/api/Fornecedores/', dados).then(doneCallbacks, failCallbacks);
    
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
    	$http.delete('http://osoriocomprasup3b.gear.host/api/Fornecedores/' + id + '/').then(function(response){
   	     	refresh();
   	    });  	    
	};

	$scope.editar = function(id) {    
		console.log(id);			
    	$http.get('http://osoriocomprasup3b.gear.host/api/Fornecedores/' + id + '/').then(function(response){
   	     	$scope.lista = response.data;
   	    });  	    
	};	

	$scope.atualizar = function() {    
		console.log($scope.lista.UnidadeDeNegocioID);	 
    	$http.put('http://osoriocomprasup3b.gear.host/api/Fornecedores/' + $scope.lista.UnidadeDeNegocioID + '/', $scope.lista).then(function(response){
   	     	refresh();
   	    }); 			    
	};		
}]);