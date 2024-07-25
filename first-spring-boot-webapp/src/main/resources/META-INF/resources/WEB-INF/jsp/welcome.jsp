<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>	
		
	        <header class="bg-primary p-3">
	            <h1 class="text-white">Welcome Page</h1>
	        </header>
        <div class="container mt-5">
            <h2 class="mt-3 text-secondary">Welcome, ${username}!</h2>
            
            <p>You have successfully logged in.</p>
            <div class="d-flex align-items-center justify-content-beween gap-5">
            	<a href="/login" class="btn btn-warning text-white">Login</a>
            	<a href="/list-todos" class="btn btn-primary">Manage your todos</a>
            </div>
        </div>
        
<%@ include file="common/footer.jspf" %>