<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <title>List Todos Page</title>
        
         <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
         
         
       <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            margin-top: 50px;
        }
        .card {
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .card-header {
            background-color: #007bff;
            color: white;
            border-radius: 10px 10px 0 0;
        }
        .table thead th {
            border: none;
            color: #007bff;
        }
        .table tbody tr {
            transition: background-color 0.3s;
        }
        .table tbody tr:hover {
            background-color: #e9ecef;
        }
    </style>
	   
		
		
	</head>
    <body>
    	<main class="container mt-5">
    		<div class="card">
    			<div class="card-header">
		        	<h3 class="mb-4">List of Your Todos, ${username}:</h3>
		        </div>
		        <div class="card-body">
			        <div class="table-responsive">     
				        <table class="table table-hover">
				            <thead>
				                <tr>
				                    
				                    <th>Description</th>
				                    <th>Target Date</th>
				                    <th>Is Done?</th>
				                    <th></th>
				                    <th></th>
				                </tr>
				            </thead>
				            <tbody>
				                <c:forEach items="${todos}" var="todo">
				                    <tr >
				                        
				                        <td >${todo.description}</td>
				                        <td >${todo.targetDate}</td>
				                        <td >
				                        	<span class="badge bg-${todo.done ? 'success' : 'danger'}">
                                            ${todo.done ? 'Yes' : 'No'}
                                        	</span>
                                        </td>
                                        <td >
                                        	<a href="update-todo?id=${todo.id}" class="btn btn-outline-success btn-sm">Update</a>
                                        </td>
                                        <td >
                                        	<a href="delete-todo?id=${todo.id}" class="btn btn-outline-danger btn-sm">Remove</a>
                                        </td>
				                    </tr>
				                </c:forEach>
				            </tbody>
				        </table>
			        </div>  
		        </div>
		        <div class="card-footer p-3">
		        	<a href="/add-todo" class="btn btn-outline-primary btn-lg" role="button">Add Todo</a>
		        </div>
	        </div> 
        </main>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		
		
    </body>
</html>
