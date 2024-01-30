import {loginpage} from "D:\\Omkar Gole\\Cypress\\cypress\\e2e\\login_repository.js"

describe("Login with orangeHRM", () =>{
    
    it("Using Fixture",() =>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
      cy.fixture('orangehrmdata'). then((data) =>{
              
                  
       
        // cy.get("input[name=username]").type(data.username)
        // cy.get("input[name=password]").type(data.password)
        // cy.get("button[type=submit").click()
     const obj = new loginpage()  
    obj.enterusername(data.username)
    obj.enterpassword(data.password)
    obj.clicksubmit()
  
  })
})
})