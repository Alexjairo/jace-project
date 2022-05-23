$(function() {
    var url = window.location.pathname;
    $("a").each(function() {
        console.log(this.pathname);

        if (url == (this.pathname)) {
            console.log(url);
            $(this).closest(".menu-item-group").addClass("item_active");
            $(this).closest(".menu-item-label-content-element").addClass("item_active_element");
            $(this).closest(".general-icon").addClass("item_icon");

        }
    });
});

function AgregarClase() {
    $("active").click(function() {
        $("estado-i").addClass("view");
    });
}
// var el = document.getElementById("content-section");
// console.log(el);
// var asientos = [];
// for (i = 0; i < el.length; i++) {
//     console.log(el[i]);
// }

var acc = document.getElementsByClassName("des");
var i;

for (i = 0; i < acc.length; i++) {
    acc[i].addEventListener("click", function() {
        this.classList.toggle("active");
        var panel = this.nextElementSibling;
        console.log(panel + "asdkaj");
        if (panel.style.maxHeight) {
            panel.style.maxHeight = null;
            panel.style.display = "none";

        } else {
            panel.style.display = "block";
            panel.style.maxHeight = panel.scrollHeight + "px";
        }
    });
}
