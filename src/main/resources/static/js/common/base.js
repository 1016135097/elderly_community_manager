
//Html5标签支持
function fHtml5Tag(){
	var aTag = ["aside","figcaption","figure","footer","header","hgroup","nav","section"],i = 0;
	for(i in aTag){document.createElement(aTag[i]);}
}



//////////////////////////////////////////////////////////////
//基础功能
//////////////////////////////////////////////////////////////

//获取参数值
function fGetQuery(name){
	var sUrl = window.location.search.substr(1);
	var r = sUrl.match(new RegExp("(^|&)" + name + "=([^&]*)(&|$)"));
	return (r == null ? null : unescape(r[2]));
}

//获取#参数值
function fGetQueryHash(name){
	var sUrl = window.location.hash.substr(1);
	var r = sUrl.match(new RegExp("(^|&)" + name + "=([^&]*)(&|$)"));
	return (r == null ? null : unescape(r[2]));
}

//GetElementById
function $id(sId){
	return document.getElementById(sId);
}







//绑定事件监听
function fEventListen(oElement, sName, fObserver, bUseCapture){
	bUseCapture = !!bUseCapture;
	if (oElement.addEventListener){
		oElement.addEventListener(sName, fObserver, bUseCapture);
	}else if(oElement.attachEvent){
		oElement.attachEvent('on' + sName, fObserver);
	}
}

//删除事件监听
function fEventUnlisten(oElement, sName, fObserver, bUseCapture){
	bUseCapture = !!bUseCapture;
	if(oElement.removeEventListener){
		oElement.removeEventListener(sName, fObserver, bUseCapture);
	}else if(oElement.detachEvent){
		oElement.detachEvent('on' + sName, fObserver);
	}
}

//限定范围随机数
function fRandom(nLength){
	return Math.floor(nLength * Math.random());
}

//url参数
function fUrlP(sName,sValue,bIsFirst){
	if(!arguments[2]){bIsFirst = false;}
	if(bIsFirst){		
		return sName + '=' + sValue;
	}else{
		return '&' + sName + '=' + sValue;
	}
}

//同步改变窗口大小与遮罩
function fResize(){
	var nBodyHeight = document.body.offsetHeight,
		nWindowHeight = document.documentElement.clientHeight,
		nResult;
	if(nBodyHeight > nWindowHeight){
		nResult = nBodyHeight;
	}else{
		nResult = nWindowHeight;
	}
	$id("mask").style.height = nResult + "px"
}

//////////////////////////////////////////////////////////////
//具体功能
//////////////////////////////////////////////////////////////





function getRnd(){
	var timestamp = new Date().getTime();
	var rnd = base64encode(utf16to8("\n" + timestamp));
	return rnd;
}

// documentReady事件支持
var DOMContentLoaded;
var DOMREADY = function(o){
	var DOMREADY = {
		isReady		:	false,
		ready		:	o,
		bindReady	:	function(){
			try{
				if ( document.readyState === "complete" ){
					DOMREADY.isReady = true;
					return setTimeout( DOMREADY.ready, 1 );
				}
				if ( document.addEventListener ){
					document.addEventListener( "DOMContentLoaded", DOMContentLoaded, false );
				}else if( document.attachEvent ){
					document.attachEvent( "onreadystatechange", DOMContentLoaded );
					var toplevel = false;
					try {
						toplevel = window.frameElement == null;
					} catch(e) {}
					if( document.documentElement.doScroll && toplevel ){
						doScrollCheck();
					}
				}
			}catch(e){}
		}
	};
	if( document.addEventListener ){
		DOMContentLoaded = function(){
			document.removeEventListener( "DOMContentLoaded", DOMContentLoaded, false );
			DOMREADY.ready();
		};

	}else if ( document.attachEvent ){
		DOMContentLoaded = function(){
			if ( document.readyState === "complete" ) {
				document.detachEvent( "onreadystatechange", DOMContentLoaded );
				if( DOMREADY.isReady ){
					return;
				}else{
					DOMREADY.isReady = true;
					DOMREADY.ready();
				}
			}
		};
	}
	function doScrollCheck(){
		if( DOMREADY.isReady ){
			return;
		}
		try {
			document.documentElement.doScroll("left");
		}catch(e){
			setTimeout( doScrollCheck, 1);
			return;
		}
		DOMREADY.isReady = true;
		DOMREADY.ready();
	}
	DOMREADY.bindReady();
};