<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="name" value="zjw" scope="request"/>
		${requestScope.name}<br/>
		=============================
		${requestScope.student.name}<br/>
		<c:set target="${requestScope.student}" property="name" value="lisi"/>
		${requestScope.student.name}<br/>
		${requestScope.map.cn }<br/>
		<c:set target="${requestScope.map}" property="cn" value="zhongguo"/>
		<c:out value="${requestScope.map.cn}"/><br/>
		<c:set var="a" value="12312" scope="request"/>
		${requestScope.a}<br/>
		<c:remove var="a" scope="request"/>
		删除后：<c:out value="${requestScope.a}"/><br/>
		<c:if test="${10>2}" var="result" >
			zhen
			${result}<br/>
		</c:if>
		<c:set var="role" value="学生" scope="request"/>
		<c:choose>
			<c:when test="${requestScope.role=='老师'}">
				老师代码……
			</c:when>
			<c:when test="${requestScope.role eq '学生'}">
				学生代码……
			</c:when>
			<c:otherwise>
				管理员等其他人员代码……
			</c:otherwise>
		</c:choose>
		================================<br/>
		<c:forEach begin="0" end="5" step="1" varStatus="status">
			${status.index}
			test……
		</c:forEach>
		<br/>==================================<br/>
		<c:forEach var="str" items="${requestScope.ss}">
			${str}<br/>
		</c:forEach>
		
		<c:forEach var="student" items="${requestScope.students}">
			${student.name}-${student.sno}<br/>
		</c:forEach>
</body>
</html>