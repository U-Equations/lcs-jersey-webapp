$(document).ready(function(){
$('form').submit(function(e){

var $form = $(this),
postMethod = $form.attr('method') || 'GET',
postURL = $form.attr('action');

var postData = JSON.stringify($form.serializeJSON());


$.ajax({
    url: postURL,
    type: postMethod,
    data: postData,

    success: function(data){
    console.log("success");
    $('#sent').text(postData);
    $('#received').text(JSON.stringify(data));
    console.log(JSON.stringify(data));},

    error: function(e){
    console.log('Error submitting form - ' + e.status + ' : ' + e.statusText);
    },

    dataType:"json",
    contentType: "application/json"
    });

    e.preventDefault();

    });
});