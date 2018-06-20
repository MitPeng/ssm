function show(classtag){
    // $(".add_customer").show();
    $("."+classtag).addClass("show");
    var left=(document.body.clientWidth-$("."+classtag).width())/2;
    var top=(document.documentElement.clientHeight-$("."+classtag).height())/2;
    $("."+classtag).css({"left":left,"top":top})
    $(window).resize(function() {
        var left=(document.body.clientWidth-$("."+classtag).width())/2;
        var top=(document.documentElement.clientHeight-$("."+classtag).height())/2;
        $("."+classtag).css({"left":left,"top":top})
    });
};
function hide(classtag){
    // $(".add_customer").hide();
    $("."+classtag).removeClass("show");
}
$(document).ready(function(){
    $(".province").hover(function(){
        $(this).find("i.icon-angle-down").addClass("icon-angle-right");
        $(this).find("i.icon-angle-down").removeClass("icon-angle-down");
        $(this).find("div.province_city").show(0);
    },function(){
        $(this).find("i.icon-angle-down").addClass("icon-angle-right");
        $(this).find("i.icon-angle-down").removeClass("icon-angle-down");
        $(this).find("div.province_city").hide(0);
    })
});