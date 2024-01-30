class loginpage
{
   
    
   enterusername(username)
    {
        cy.get("input[name=username]").type(username)
    }
    enterpassword(password)
    {
        cy.get("input[name=password]").type(password)
    }


clicksubmit()
{
    cy.get("button[type=submit]").click()
}
}
export {loginpage}