$(document).ready(function(){

        var counter = 3;

        $("#addButton").click(function () {

console.log("adding a text box.");

    	if(counter>10){
                console.log("Only 10 textboxes allowed");
                return false;
    	}

console.log("counter: " + counter);

    	var newTextBoxDiv = $(document.createElement('div'))
    	     .attr("id", 'TextBoxDiv' + counter)
    	     .attr("class",'form-group');

console.log(newTextBoxDiv);

    	newTextBoxDiv.after().html('<label>Word '+ counter + ' :&nbsp;</label>' +
    	      '<input type="text" name="setOfStrings[][value]" id="wordbox_' + counter + '" value="" >');

    	newTextBoxDiv.appendTo("#TextBoxesGroup");


    	counter++;
         });

         $("#removeButton").click(function () {
    	if(counter==3){
              console.log("need at least 2 text boxes");
              return false;
           }

    	counter--;

            $("#TextBoxDiv" + counter).remove();

         });

         $("#getButtonValue").click(function () {

    	var msg = '';
    	for(i=1; i<counter; i++){
       	  msg += "\n Textbox #" + i + " : " + $('#wordbox_' + i).val();
    	}
        	  console.log(msg);
         });
      });