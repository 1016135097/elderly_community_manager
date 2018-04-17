var _url=_path+"/sys/org/ajaxList";
	//注意：autoParam中的id自动提交参数的前提是以isParent为前提，当isParent为true时候，则开始异步加载
		var setting = {
			async: {
				enable: true,
				type: "post",
				url:_url,
				autoParam:["id=orgId"],
				otherParam:{"otherParam":"zTreeAsyncTest"},
				dataFilter: filter
			},
			view: {expandSpeed:"",
				dblClickExpand: dblClickExpand,
				addHoverDom: addHoverDom,
				removeHoverDom: removeHoverDom,
				selectedMulti: true
			},
			edit: {
				enable: false
			},
			data: {
				simpleData: {
					enable: true,
					idKey : "id", // id编号命名     
	                pIdKey : "pId", // 父id编号命名      
	                rootId : 0  
				}
			},
			callback: {
				beforeRemove: beforeRemove,
				beforeRename: beforeRename,
				//捕获异步加载出现异常错误的事件回调函数 和 成功的回调函数    
	            onAsyncSuccess : function(event, treeId, treeNode, msg){    
	                //  alert("调用成功！");  
	                //var nodes=getCheckedNodes(true));  
	                //alert(treeNode);  
	            },  
			}
		};

		//双击展开菜单
		function dblClickExpand(treeId, treeNode) {
			return true;
		}
		
		//用于对 Ajax 返回数据进行预处理的函数	
		function filter(treeId, parentNode, childNodes) {
			if (!childNodes) {
				return null;	
			}
			for (var i=0, l=childNodes.length; i<l; i++) {
				childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
			}
			return childNodes;
		}
		
		//在删除节点时候触发事件
		function beforeRemove(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			zTree.selectNode(treeNode);
			return confirm("确认删除 节点 -- " + treeNode.name + " 吗？");
		}		
		
		function beforeRename(treeId, treeNode, newName) {
			alert(11);
			if (newName.length == 0) {
				alert("节点名称不能为空.");
				return false;
			}
			return true;
		}

		
		var newCount = 1;
		//鼠标经过：显示增加、修改和删除按钮
		function addHoverDom(treeId, treeNode) {
			var isOk = false;
				isOk = delNode(treeId, treeNode);
				isOk = editNode(treeId, treeNode);
				isOk = addNode(treeId, treeNode);
			return isOk;
		};
		
		
		//鼠标移开：不显示按钮
		function removeHoverDom(treeId, treeNode) {
			//移除新增按钮
			$("#addBtn_"+treeNode.tId).unbind().remove();
			//移除编辑按钮
			$("#editBtn_"+treeNode.tId).unbind().remove();
			//移除删除按钮
			$("#delBtn_"+treeNode.tId).unbind().remove();
		};

		//页面加载：调用方法
		function loadOrgTree() {
			$.fn.zTree.init($("#treeDemo"), setting);
		}
		
		/*$(document).ready(function(){
			alert(123);
			$.fn.zTree.init($("#treeDemo"), setting);
		});*/
