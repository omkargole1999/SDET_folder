describe("sign up for spice jet" , () =>{ 
    it("Json_signup" , () =>{
          //cy.visit("c")
         // cy.get("div[class='css-76zvg2 r-jwli3a r-ubezar']").click()
          
          //cy.get("div[class='css-76zvg2 r-jwli3a r-ubezar']").click()
         // cy.get('.r-eu3ka > .css-76zvg2').click()
       // cy.get('.r-eu3ka > .css-76zvg2').click()

    cy.fixture("Signup") . then ((user) =>{
    cy.visit(user.url)
    cy.get('.col-sm-4 > .form-control').select(user.title).should("be.visible")
    cy.get('#first_name').should("be.visible").type(user.first_name)
    cy.get('#last_name').should("be.visible").type(user.last_name)
    cy.get(':nth-child(3) > :nth-child(1) > .form-control').select(user.country)
    cy.get('#dobDate').should("be.visible").type("11-May-1999")
    
    cy.get('.react-tel-input > .form-control').should("be.visible").type(user.mobile_no)
    cy.get('#email_id').click().should("be.visible").type(user.email)
    cy.get('#new-password').click().type(user.password)
    
    cy.get('#c-password').click().type(user.password)
    cy.get('#defaultCheck1').check();
    cy.get('.px-sm-4 > a > .btn').click()
    })

      
    })
})