<!doctype html>

<html lang="en">
<head>

<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

<link rel="stylesheet" type="text/css" href="bower_components/bootstrap/dist/css/bootstrap.min.css">

<title>LCS</title>
</head>
<body>
<div class="container panel panel-default">
    <h4>LCS Web App</h4>
    </div>

    <div class="container panel panel-default">
<br>
<br>
    <div class="container panel panel-default">
        <h4>DATA SENT</h4>
        <h4><div id="sent" class="well"></div></h4>
        </div>



        <div class="container panel panel-default">
        <h4>DATA RECEIVED</h4>
        <h4><div id="received" class="well"></div></h4>
       </div>


    <div class="container panel panel-default">
   <fieldset>
    <legend><h4>POST</h4></legend>
    <fieldset>
    <legend><h5>add/remove word box</h5></legend>
    <input type='button' value='add word box' id='addButton' class="btn btn-default">
    <input type='button' value='remove word box' id='removeButton' class="btn btn-default">
    <br><br>
    </fieldset>
    </div>
    <div class="container panel panel-default">
<form id="lcs" method="post" role="form" action="api/v1/lcs">
<div id='TextBoxesGroup'>
<div id="TextBoxDi1" class="form-group">
<br>
<label for="word_1">Word 1 :</label>
<input id="wordbox_1" type="text" name="setOfStrings[][value]" class="">
</div>

<div id="TextBoxDiv2" class="form-group">
<label for="word_2">Word 2 :</label>
<input id="wordbox_2" type="text" name="setOfStrings[][value]" class="">
</div>

</div>
    <br/>
<div class="form-group">
    <input type="submit" value="execute&nbsp;lcs&nbsp;&nbsp;" class="btn btn-default"/>
    </div>
    </form>
</div>
</fieldset>

    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/jquery.serializeJSON/jquery.serializejson.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="js/add_word_box.js"></script>
    <script src="js/post_form_data.js"></script>
</body>
</html>
