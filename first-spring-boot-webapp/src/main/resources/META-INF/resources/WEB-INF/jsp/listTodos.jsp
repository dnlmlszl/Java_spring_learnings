<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>	

    	<main class="container">
    		<div class="card">
    			<div class="card-header bg-primary">
		        	<h3 class="text-white">Your Personal Todos:</h3>
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
        <%@ include file="common/footer.jspf" %>
