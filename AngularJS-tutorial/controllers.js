//app 모듈 내에 controller 정의
angular.module('todoModule').controller('TodoCtrl', function($scope, todoStorage){
    
    $scope.todos = todoStorage.get();

    $scope.remove = function(todo){
        todoStorage.remove(todo);
    }

    $scope.add = function(newTodoTitle){
        todoStorage.add(newTodoTitle);   
        
        //empty form
        $scope.newTodoTitle = '';
    }

    $scope.update = function(){
        todoStorage.update();
    }
});