$(function () {
    $(".main .mid ul li input").focus(function () {
        $(this).attr("value", "");
        $(this).attr("outline", "none");
    });
    $(".main .mid ul li input").blur(function () {
        $(this).attr("value", "用户名/已验证手机或邮箱");
    });
    $(".main .mid .mid_foot input").mouseenter(function(){
        $(this).css({
            "background-color":"#1c429a"

        });

    });
    $(".main .mid .mid_foot input").mouseleave(function(){
        $(this).css({
            "background-color":"#0067b8"
        });
    });

})
