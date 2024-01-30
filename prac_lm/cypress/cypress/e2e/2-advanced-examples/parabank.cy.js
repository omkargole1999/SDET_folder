
describe("para bank" , ()=>{
       it.skip("mailing " , () =>{
        cy.visit("https://parabank.parasoft.com/parabank/index.htm");
        cy.get('.contact > a').click();
        cy.get('#name').click().type("Omi");
        cy.get('#email').click().type("Omi222@gmail.com");
        cy.get('#phone').type("8787878");
        cy.get('#message').type("I am Facing technical error");
        cy.get('[colspan="2"] > .button').click()     
       })
       it.only("register to para bank" , ()=>{
              cy.fixture("parabank_repo").then((register)=>{
              cy.visit(register.Url)
              cy.get('#loginPanel > :nth-child(3) > a').click()
              cy.get(':nth-child(1) > [width="20%"]').type(register.First_name)
              cy.get(':nth-child(2) > [width="20%"]').type(register.Last_name)
              cy.get(':nth-child(3) > [width="20%"]').type(register.Address)
              cy.get(':nth-child(4) > [width="20%"]').type(register.City)
              cy.get(':nth-child(5) > [width="20%"]').type(register.State)
              cy.get(':nth-child(6) > [width="20%"]').type(register.Zip_code)
              cy.get(':nth-child(7) > [width="20%"]').type(register.Phone_no)
              cy.get(':nth-child(8) > [width="20%"]').type(register.SSN)
              cy.get(':nth-child(10) > [width="20%"]').click().type(register.Username)
              cy.get(':nth-child(11) > [width="20%"]').click().type(register.Password)
              cy.get(':nth-child(12) > [width="20%"]').click().type(register.Password)
              cy.get('[colspan="2"] > .button').click()
              })

       })
       it.only("login and logout" , () =>{
              cy.fixture("parabank_repo").then((user_cred) =>{
                     cy.visit(user_cred.Url)
                     cy.get(':nth-child(2) > .input').click().type(user_cred.Username)
                     cy.get(':nth-child(4) > .input').click().type(user_cred.Password)
                     cy.get(':nth-child(5) > .button').click()
                     cy.wait(5000)
                    // cy.get('#leftPanel > ul > :nth-child(8) > a').click()
                    // cy.task('renameMochawesomeReporter' , Report{'report- Parabank'} )

              })
       })
})