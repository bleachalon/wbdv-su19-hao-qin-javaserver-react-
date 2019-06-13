(function () {
    var userService = new UserService();
    var rowTemplate;
    var tbody;
    var createUserBtn;

    jQuery(main);
    
    function main() {
        rowTemplate = jQuery('.wbdv-template');
        createUserBtn = jQuery('.wbdv-create');
        tbody = jQuery('tbody');

        createUserBtn.click(createUser);
        
        userService
            .findAllUsers()
            .then(renderUsers)
    }
    
    function createUser() {
        var usernameFld = $('#usernameFld');
        var passwordFld = '';
        var firstNameFld= $('#firstNameFld');
        var lastNameFld= $('#lastNameFld');
        
        var username = usernameFld.val();
        var password = 'boggus';
        var firstName= firstNameFld.val();
        var lastName= lastNameFld.val();

        var user = {
            username: username,
            password: password,
            firstName: firstName,
            lastName: lastName
        }

        userService
            .createUser(user)
            .then(renderUsers)
    }

    function renderUsers(users) {
        tbody.empty()
        for(var u in users) {
            const user = users[u]
            const rowClone = rowTemplate.clone();
            rowClone.removeClass('wbdv-hidden');
            rowClone.find('.wbdv-username').html(user.username);
            rowClone.find('.wbdv-first-name').html(user.firstName);
            rowClone.find('.wbdv-last-name').html(user.lastName);
            
            
            tbody.append(rowClone);
        }
    }
})()


//
//(function () {
//    var userService = new UserService();
//    var rowTemplate;
//    var tbody;
//    var createUserBtn;
//
//    jQuery(main);
//    
//    function main() {
//        rowTemplate = jQuery('.wbdv-template');
//        createUserBtn = jQuery('.wbdv-create');
//        tbody = jQuery('tbody');
//
//        createUserBtn.click(createUser);
//        
//        userService
//            .findAllUsers()
//            .then(renderUsers)
//    }
//    
//    function createUser() {
//        var usernameFld = $('#usernameFld');
//        var passwordFld = '';
//        var firstNameFld= $('#firstNameFld');
//        var lastNameFld= $('#lastNameFld');
//        var roleFld= $('#roleFld');
//
//        var username = usernameFld.val();
//        var password = 'boggus';
//        var firstName= firstNameFld.val();
//        var lastName= lastNameFld.val();
//        var role= roleFld.val();
//
//        var user = {
//            username: username,
//            password: password,
//            firstName: firstName,
//            lastName: lastName,
//            role: roleFld
//        }
//
//        userService
//            .createUser(user)
//            .then(renderUsers)
//    }
//
//    function renderUsers(users) {
//        tbody.empty()
//        for(var u in users) {
//            const user = users[u]
//            const rowClone = rowTemplate.clone();
//            rowClone.removeClass('wbdv-hidden');
//            rowClone.find('.wbdv-username').html(user.username);
//            tbody.append(rowClone);
//        }
//    }
//})()