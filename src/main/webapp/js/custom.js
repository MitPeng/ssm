/*nav li高度*/
var liH=function(){
	var height=parseInt($(".head-bottom").height())-9;
	$(".nav li").height(height/9);
}
var buttonSize=function(){
	if(parseInt(document.body.clientWidth)<1415){
		$("#foot .foot-top li button").css({
			"padding":"0 5px",
			"font-size":"8px"
		})
		$("#foot .foot-top li:nth-child(4)>div img").css({
			"width":"15px"
		})
	}else{
		$("#foot .foot-top li button").css({
			"padding":"0 8px",
			"font-size":"12px"
		})
		$("#foot .foot-top li:nth-child(4)>div img").css({
			"width":"21px"
		})
	}
}
/*懒加载*/
var oDiv=$(".ljz").find('img');
imgNum = oDiv.length,
img = $(".ljz").find('img');
function lazyload(event) {
	for (var i = 0; i < imgNum; i++) {
		if (img.eq(i).offset().top < parseInt($(window).height()) + parseInt($(window).scrollTop())) {
		    if (img.eq(i).attr("src") == "1.png"|| "2.png"|| "3.png") {
		        var src = img.eq(i).attr("data-src");
		        img.eq(i).attr("src", src);
		        n = i + 1;
		    }
		}
	}
}
//分页
var ms = {
		        init:function(totalsubpageTmep,args){
		            return (function(){
		                ms.fillHtml(totalsubpageTmep,args);
		                ms.bindEvent(totalsubpageTmep,args);
		            })();
		        },
		        //填充html
		        fillHtml:function(totalsubpageTmep,args){
		            return (function(){
		                totalsubpageTmep="";
		                // 页码大于等于4的时候，添加第一个页码元素
		                if(args.currPage!=1 && args.currPage>=4 && args.totalPage!=4) {
		                    totalsubpageTmep += "<li class='ali'><a href='javascript:void(0);' class='geraltTb_pager' data-go='' >"+1+"</a></li>";
		                }
		                /* 当前页码>4, 并且<=总页码，总页码>5，添加“···”*/
		                if(args.currPage-2>2 && args.currPage<=args.totalPage && args.totalPage>5) {
		                    totalsubpageTmep += "<li class='ali'><a href='javascript:void(0);' class='geraltTb_' data-go='' >...</a></li>";
		                }
		                /* 当前页码的前两页 */
		                var start = args.currPage-2;
		                /* 当前页码的后两页 */
		                var end = args.currPage+2;
		
		                if((start>1 && args.currPage<4) || args.currPage==1) {
		                    end++;
		                }
		                if(args.currPage>args.totalPage-4 && args.currPage>=args.totalPage) {
		                    start--;
		                }
		                for(; start<=end; start++) {
		                    if(start<=args.totalPage && start>=1) {
		                        totalsubpageTmep += "<li class='ali'><a href='javascript:void(0);' class='geraltTb_pager' data-go='' >"+start+"</a></li>";
		                    }
		                }
		                if(args.currPage+2<args.totalPage-1 && args.currPage>=1 && args.totalPage>5) {
		                    totalsubpageTmep += "<li class='ali'><a href='javascript:void(0);' class='geraltTb_' data-go='' >...</a></li>";
		                }
		
		                if(args.currPage!=args.totalPage && args.currPage<args.totalPage-2 && args.totalPage!=4) {
		                    totalsubpageTmep += "<li class='ali'><a href='javascript:void(0);' class='geraltTb_pager' data-go='' >"+args.totalPage+"</a></li>";
		                }
		                $(".pagination").html(totalsubpageTmep);
		            })();
		        },
		        //绑定事件
		        bindEvent:function(totalsubpageTmep,args){
		            return (function(){
		                totalsubpageTmep.on("click","a.geraltTb_pager",function(event){
		                    var current = parseInt($(this).text());
		                    ms.fillHtml(totalsubpageTmep,{"currPage":current,"totalPage":args.totalPage,"turndown":args.turndown});
		                    if(typeof(args.backFn)=="function"){
		                        args.backFn(current);
		                    }
		                });
		            })();
		        }
		    }
		    $.fn.createPage = function(options){       
		        ms.init(this,options);
		    }