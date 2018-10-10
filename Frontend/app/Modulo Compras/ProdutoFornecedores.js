var myApp = angular.module('myApp', []);
myApp.controller('AppCtrl', ['$scope', '$http', function($scope, $http) {   

	var refresh = function(){
   	  $http.get('http://osoriocomprasup3b.gear.host/api/ProdutoFornecedores/').then(doneCallbacks, failCallbacks);
    
		 function doneCallbacks(res) { 			
 			$scope.livroslista = res.data.produtoFornecedor;
 			$scope.lista = {};
			console.log(res.data.produtoFornecedor);		
 		}

		 function failCallbacks(err) {
 			console.log(err.message);
 		}
	};

	refresh();

	$scope.addLivro = function() {    


		$scope.lista.ProdutoID = parseFloat($scope.lista.ProdutoID);
		$scope.lista.CodigoProduto = parseFloat($scope.lista.CodigoProduto);
		$scope.lista.UnidadeDeNegocioID = parseFloat($scope.lista.UnidadeDeNegocioID);
		$scope.lista.TempoMedio = parseFloat($scope.lista.TempoMedio);
		$scope.lista.PrecoMedio = parseFloat($scope.lista.PrecoMedio);
		$scope.lista.QtdOrdemMin = parseFloat($scope.lista.QtdOrdemMin);
		$scope.lista.QtdOrdemMax = parseFloat($scope.lista.MetodoBase);
		$scope.lista.CustoRecebimento = parseFloat($scope.lista.CustoRecebimento);
		console.log($scope.lista);		
		var dados = $scope.lista;		
		$http.post('http://osoriocomprasup3b.gear.host/api/ProdutoFornecedores/', dados).then(doneCallbacks, failCallbacks);
    
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
    	$http.delete('http://osoriocomprasup3b.gear.host/api/ProdutoFornecedores/' + id + '/').then(function(response){
   	     	refresh();
   	    });  	    
	};

	$scope.editar = function(id) {    
		console.log(id);			
    	$http.get('http://osoriocomprasup3b.gear.host/api/ProdutoFornecedores/' + id + '/').then(function(response){
   	     	$scope.lista = response.data;
   	    });  	    
	};	

	$scope.atualizar = function() {    
		console.log($scope.lista.ProdutoID);	 
    	$http.put('http://osoriocomprasup3b.gear.host/api/ProdutoFornecedores/' + $scope.lista.ProdutoID + '/', $scope.lista).then(function(response){
   	     	refresh();
   	    }); 			    
	};		
}]);