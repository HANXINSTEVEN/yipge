<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.oracle.entity.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
</head>
<body>

<div class="container clearfix">
    <%@include file="menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="#">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">购物车管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                        <tr>
                            
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="date" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="admin_add.jsp"><i class="icon-font"></i>新增用户</a>
                        <a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                            <th>排序</th>
                       
                            <th>cimgname</th>
                            <th>商品名称</th>
                            <th>商品价格</th>
                            <th>购买数量</th>
                            <th>商品库存</th>
                            <th>商品pid</th>
                            <th>用户名uid</th>
                              <th>订单有效性</th>
                            <th>操作</th>
                        </tr>
                       <c:forEach items="${cartli}" var="zz">
                        <tr>
                        
                            <td class="tc"><input name="id[]" value="58" type="checkbox"></td>
                            <td>
                                <input name="ids[]" value="58" type="hidden">
                                <input class="common-input sort-input" name="ord[]" value="0" type="text">
                            </td>
                           
                            <td>${zz.getCimgname()}</td>
                            <td >${zz.getPname()}</a>
                            </td>
                            <td>${zz.getPrice()}</td>
                            <td>${zz.getCquantity()}</td>
                            <td>${zz.getCstock()}</td>
                            <td>${zz.getPid()}</td>
                            <td>${zz.getUid()}</td>
                            <td>${zz.getCvalid()}</td>
                        
                            <td>
                                <a class="link-update" href="#">修改</a>
                                <a class="link-del" href="#">删除</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                   
                    <div class="list-page">
                   	共${tsum}条记录,当前1/${totalpages}页
                   	<a href="/manager/CartShow?cp=1">首页</a>
                     <a href="/manager/CartShow?cp=${cp-1<1?1:cp-1}">上一页</a>
                     <a href="/manager/CartShow?cp=${cp+1>totalpages?cp:cp+1}">下一页</a>
                     <a href="/manager/CartShow?cp=${totalpages}">尾页</a>
                     </div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>