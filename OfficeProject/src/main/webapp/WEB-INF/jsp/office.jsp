<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="./header.jsp" />
 <style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
    <form:form method="POST"  action="/addOffice"   modelAttribute="offices"  >
   
             <table>
                <tr>
                    <td><form:label path="officeName">Name</form:label></td>
                    <td><form:input path="officeName"/></td>
                    <td><form:errors path = "officeName" cssClass = "error" /></td>

                </tr>
                <tr>
                    <td><form:label path="officeNumber">Office Number</form:label></td>
                    <td><form:input path="officeNumber"/></td>
                  <td>  <form:errors path ="officeNumber" cssClass = "error" /></td>
                  

                </tr>
                <tr>
                    <td><form:label path="officeAddress">
                      Address</form:label></td>
                    <td><form:input path="officeAddress"/></td>
                 <td>  <form:errors path ="officeAddress" cssClass = "error" /></td>

                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
   

<jsp:include page="./footer.jsp" />