var myApp = angular.module('myApp', []);
myApp.controller('AppCtrl', ['$scope', '$http', function($scope, $http) {   

	var refresh = function(){
   	  $http.get('http://osoriocomprasup3b.gear.host/api/DetalhesDoPedidoes').then(doneCallbacks, failCallbacks);
    
		 function doneCallbacks(res) { 			
 			$scope.livroslista = res.data.detalhespedido;
 			$scope.lista = {};
			console.log(res.data.detalhespedido);		
 		}

		 function failCallbacks(err) {
 			console.log(err.message);
 		}
	};

	refresh();

	$scope.addLivro = function() {    	
		$scope.lista.MetodoBase = parseFloat($scope.lista.MetodoBase);
		$scope.lista.MetodoRate = parseFloat($scope.lista.MetodoRate);
		console.log($scope.lista);		
		var dados = $scope.lista;		
		$http.post('http://osoriocomprasup3b.gear.host/api/DetalhesDoPedidoes/', dados).then(doneCallbacks, failCallbacks);
    
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
    	$http.delete('http://osoriocomprasup3b.gear.host/api/DetalhesDoPedidoes/' + id + '/').then(function(response){
   	     	refresh();
   	    });  	    
	};

	$scope.editar = function(id) {    
		console.log(id);			
    	$http.get('http://osoriocomprasup3b.gear.host/api/DetalhesDoPedidoes/' + id + '/').then(function(response){
   	     	$scope.lista = response.data;
   	    });  	    
	};	

	$scope.atualizar = function() {    
		console.log($scope.lista.DetalhesPedidoID);	 
    	$http.put('http://osoriocomprasup3b.gear.host/api/DetalhesDoPedidoes/' + $scope.lista.DetalhesPedidoID + '/', $scope.lista).then(function(response){
   	     	refresh();
   	    }); 			    
	};		
}]);