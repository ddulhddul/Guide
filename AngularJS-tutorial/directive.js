angular.module('todoModule').directive('todoTitle', function(){
    return {
        template: '<h1>Todo List</h1>'
    }
});

angular.module('todoModule').directive('todoItem', function(){
    return {
        templateUrl: 'todoItem.tpl.html'
    }
});

angular.module('todoModule').directive('todoFilters', function(){
    return {
        templateUrl: 'todoFilters.tpl.html'
    }
});

angular.module('todoModule').directive('todoForm', function(){
    return {
        templateUrl: 'todoForm.tpl.html'
    }
});
