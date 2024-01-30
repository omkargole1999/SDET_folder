describe('Hooks', ()=>{

    before(function(){
        cy.log('This is the setup block')
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    })

    after(function(){
        cy.log('This is the teardown block')
    })

    beforeEach(function(){
        cy.log('This is the login block')

        //cy.fixture('orangehrmdata').then((data)=>{ 
        cy.get("input[name=username]").type("Admin")
    cy.get("input[name=password]").type("admin123")
    cy.get("button[type=submit").click()
            
        
    })

    afterEach(function(){
        cy.log('This is the logout block')
        cy.log('This is the logout block')
        cy.get('.oxd-userdropdown-name').click()
        cy.wait(3000)
    cy.get(':nth-child(4) > .oxd-userdropdown-link').click()
    })

   

   it("Test",()=>{
    cy.log('This is the test')
   })
    
})