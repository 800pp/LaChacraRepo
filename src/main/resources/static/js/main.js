console.log("asdsad");
 //****** toggle menu y otros***********

    var principalToggle = document.getElementById("principalToggle");
    var principalToggleLineas = document.getElementsByClassName("principalToggle-linea");
    var principalMenu = document.getElementById("principal-menu");
    var principalContenedor = document.getElementById("principal-contenedor");
    var principalOpcionesLinks = document.querySelectorAll("#principal-menu a");

    // var principalToggleActive = document.getElementsByClassName("principalToggleActive");

    principalToggle.addEventListener("click", function(){

        principalToggle.classList.toggle("principalTogglevisible");
        principalMenu.classList.toggle("principal-menu-nav");

        if(principalToggle.className == "principalTogglevisible"){
            
            principalToggleLineas[0].setAttribute( "style", "margin: 0; transform:  rotate(45deg) translate(2px ,5px);");
            principalToggleLineas[1].setAttribute("style", "margin: 0; transform:  rotate(-45deg);");
        //  principalContenedor.setAttribute(
        //     "style", "transform: translate(200px,0);"); 
        }else{
            principalToggleLineas[0].setAttribute( "style", "margin-bottom: 5px; transform:  rotate(0) translate(0);");
            principalToggleLineas[1].setAttribute("style", "margin-bottom: 5px; transform:  rotate(0);");
        //  principalContenedor.setAttribute(
        //     "style", "transform: translate(0);"); 
        }
        
    });


