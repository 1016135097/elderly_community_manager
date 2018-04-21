/*!
 *@author wuwei
 *@time 20170831
 */
function getRootPath() {
    //获取当前网址，如： http://localhost:8083/proj/meun.jsp
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，如： proj/meun.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPath = curWwwPath.substring(0, pos);
    //获取带"/"的项目名，如：/proj
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    return (localhostPath + projectName);
}

    Date.prototype.Format = function(formatStr)
    {
        var str = formatStr;
        var Week = ['日','一','二','三','四','五','六'];

        str=str.replace(/yyyy|YYYY/,this.getFullYear());
        str=str.replace(/yy|YY/,(this.getYear() % 100)>9?(this.getYear() % 100).toString():'0' + (this.getYear() % 100));

        str=str.replace(/MM/,this.getMonth()>9?this.getMonth().toString():'0' + this.getMonth());
        str=str.replace(/M/g,this.getMonth());

        str=str.replace(/w|W/g,Week[this.getDay()]);

        str=str.replace(/dd|DD/,this.getDate()>9?this.getDate().toString():'0' + this.getDate());
        str=str.replace(/d|D/g,this.getDate());

        str=str.replace(/hh|HH/,this.getHours()>9?this.getHours().toString():'0' + this.getHours());
        str=str.replace(/h|H/g,this.getHours());
        str=str.replace(/mm/,this.getMinutes()>9?this.getMinutes().toString():'0' + this.getMinutes());
        str=str.replace(/m/g,this.getMinutes());

        str=str.replace(/ss|SS/,this.getSeconds()>9?this.getSeconds().toString():'0' + this.getSeconds());
        str=str.replace(/s|S/g,this.getSeconds());

        return str;
    }
    function menuState() {
       var menuState= $('body').attr('class');
       if(menuState!=null){

           if(menuState =='nav-sm'){
               menuState='nav-md';
           }else if(menuState='nav-md'){
               menuState='nav-sm'
           }
       }
        var url = getRootPath()+"/saveMenuState";
        $.ajax({
            type:"post",
            url:url,
            dataType:"json",
            data:{"menuState":menuState},
            success:function() {
            console.log('保存页面状态成功。');
            },
            error:function () {
                console.log("保存页面状态失败");
            }
        });
        
    }
    function getServerPath() {
        return "http://192.168.1.188:7070/website/";

    }
    function GetQueryString(name)
    {
        var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if(r!=null)return  decodeURI(r[2]); return null;
    }