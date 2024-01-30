
describe("Parabank test suite" ,() =>{
       before("Setup for testing" ,() =>{
           
           
                cy.fixture("parabank_repo").then((register)=>{
                cy.visit(register.Url)
                // cy.get('#loginPanel > :nth-child(3) > a').click()
                // cy.get(':nth-child(1) > [width="20%"]').type(register.First_name)
                // cy.get(':nth-child(2) > [width="20%"]').type(register.Last_name)
                // cy.get(':nth-child(3) > [width="20%"]').type(register.Address)
                // cy.get(':nth-child(4) > [width="20%"]').type(register.City)
                // cy.get(':nth-child(5) > [width="20%"]').type(register.State)
                // cy.get(':nth-child(6) > [width="20%"]').type(register.Zip_code)
                // cy.get(':nth-child(7) > [width="20%"]').type(register.Phone_no)
                // cy.get(':nth-child(8) > [width="20%"]').type(register.SSN)
                // cy.get(':nth-child(10) > [width="20%"]').click().type("ftt22@gmail.com")
                // cy.get(':nth-child(11) > [width="20%"]').click().type(register.Password)
                // cy.get(':nth-child(12) > [width="20%"]').click().type(register.Password)
                // cy.get('[colspan="2"] > .button').click()
                // cy.get('#leftPanel > ul > :nth-child(8) > a').click()
               
                })
            })
  
     
       after("after all test cases are performed" , () =>{
        cy.log("All test cases are peroformed  !!!!")
       })
       beforeEach("Login" , () =>{
        cy.fixture("parabank_repo").then((user_cred ) =>{
            cy.visit("https://parabank.parasoft.com/parabank/index.htm")
            cy.get(':nth-child(2) > .input').click().type("ftt22@gmail.com")
            cy.get(':nth-child(4) > .input').click().type(user_cred.Password)
            cy.get(':nth-child(5) > .button').click()
        })
       })
       afterEach("Logout" , () =>{
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
        
             
       })
       
       it("Test 1  : Fund transfer" , () =>{
        cy.get('#leftPanel > ul > :nth-child(3) > a').click()
        cy.get('#amount').type(56434).click()
        cy.get(':nth-child(4) > .button').click();

        
       })
       it("Test 2 : Request loan" , () =>{
        
       cy.get('#leftPanel > ul > :nth-child(7) > a').click();
       cy.get('#amount').click().type(88889)
       cy.get('#downPayment').click().type(5000)
       //cy.get('#fromAccountId').click().select(18783)
       cy.get('[colspan="2"] > .button').click()
       })   
       it("Test 3 : Open new Account" , () =>{
        cy.get('#leftPanel > ul > :nth-child(1) > a').click()
        cy.get('#type').select("SAVINGS")
        cy.get('form.ng-valid > div > .button').click()
       })

})