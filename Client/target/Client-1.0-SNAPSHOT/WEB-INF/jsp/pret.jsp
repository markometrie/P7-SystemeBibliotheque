<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
    <head>
                      <!-- Bootstrap -->

                      <link rel="stylesheet"

	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
        
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        
	crossorigin="anonymous" />
                      
                      
                      <link href="/docs/4.2/dist/css/bootstrap.min.css" rel="stylesheet"
                            
                      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" 
                      
                      crossorigin="anonymous">
                      
                      

                      

                      <!-- Chargement du fichier style.css -->
                      
                      <link rel="stylesheet" href="resources/css/style.css" />
                      
                      

        
    </head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des prêts</title>
    </head>
    
    
    
    <body>
        
        
        
      <logic:iterate id="pret" name="pret">
       <tr>
       <td><bean:write name="pret" property="refouvrage"/></td>
       <td><bean:write name="pret" property="refclient"/></td>
       <td>
       </tr> 
     </logic:iterate>
        
        
    </body>
    
    
</html>
