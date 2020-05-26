var prefix = "http://localhost/";
var restGetById = function () {
    var id = $("input#id-value").val();

    $.ajax({
        type: 'GET',
        url: prefix + id,
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.title + '</h1>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);

        }
    });
};

var restPost = function () {
    var name = $("input#name-value").val();
    var jsonObject = {
        title: name
    };
    console.log("Request: " + name);
    $.ajax({
        type: 'POST',
        url: prefix,
        dataType: 'json',
        async: true,
        contentType: 'application/json',
        data: JSON.stringify(jsonObject),
        success: function (result) {
            console.log(result);
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.title + '</h1>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);

        }
    });
};

var restGetAll = function () {
    var str="";
    $.ajax({
        type: 'GET',
        url: prefix + 'all',
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
            $.each(result,function (index, value) {
               console.log(index);
               console.log(value);
                str=str+'<h1>' + value.id + ' ' + value.title + '</h1>';
            });
            $(".hello-reaction").html(str);

        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);

        }
    });
};

var update = function () {
    var name = $("input#name-value").val();
    var id = $("input#id-value").val();
    var jsonObject = {
        title: name
    };
    console.log("Request: " + name);
    $.ajax({
        type: 'POST',
        url: prefix,
        dataType: 'json',
        async: true,
        contentType: 'application/json',
        data: JSON.stringify(jsonObject),
        success: function (result) {
            console.log(result);
            $(".hello-reaction").html('<h1>' + result.id + ' ' + result.title + '</h1>');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log("ERROR: ");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);

        }
    });
};