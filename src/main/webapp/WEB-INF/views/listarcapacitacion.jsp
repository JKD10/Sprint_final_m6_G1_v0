<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="cl.sprint.M6_Grupo2.model.entity.Capacitacion"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Listado de Capacitaciones</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>

<body>

	<div class="container">

		<%@ include file='navbar.jsp'%>
		<section>
			<h1>Capacitaciones</h1>

			<table class="table">
				<thead class="table-dark">
					<tr>
						<th>Id Capacitacion</th>
						<th>Empresa</th>
						<th>Dia</th>
						<th>Hora</th>
						<th>Lugar</th>
						<th>Duracion</th>
						<th>Cantidad de asistentes</th>
						<th>Detalle</th>

					</tr>
				</thead>
				<tbody>

					<%
					
					ArrayList<Capacitacion> capacitaciones = (ArrayList<Capacitacion>) request.getAttribute("capacitaciones");
					for(Capacitacion c : capacitaciones){
						%>
					<tr>	
						<td><%=c.getIdCapacitacion() %></td>
						<td><%=c.getEmpresa() %></td>
						<td><%=c.getDia()  %></td>
						<td><%=c.getHora() %></td>
						<td><%=c.getLugar() %></td>
						<td><%=c.getDuracion() %></td>
						<td><%=c.getCantidadAsistentes() %></td>
						<td><%=c.getDetalle() %></td>


					</tr>
					<%
					}
					%>
				</tbody>
			</table>

		</section>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>

</html>