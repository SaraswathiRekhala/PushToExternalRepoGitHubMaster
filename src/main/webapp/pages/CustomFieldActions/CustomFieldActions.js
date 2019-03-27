Application.$controller("CustomFieldActionsPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };

}]);


Application.$controller("AllTypesTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.customFieldAction = function(selectedItemData) {
            debugger
            console.log(selectedItemData);
            $scope.Variables.DbscenariosExecuteHQL_AllTypesWithId.setInput('PKID', selectedItemData.pkId);
            $scope.Variables.DbscenariosExecuteHQL_AllTypesWithId.invoke();
        };

    }
]);

Application.$controller("executeHQL_AllTypesWithIdTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);