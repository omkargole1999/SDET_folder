

describe("alert" , () =>{
    it.skip("simple alert box" , ()=>{
         cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
         cy.get('#alertexamples').click()
         cy.on('window:alert' , (t) =>{
              expect(t).contains("I am an alert box")
         })
    })
    it.only("simple confirm box" , () =>{
        cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
        cy.get('#confirmexample').click()
        cy.on('window:confirm' , (o) =>{
             expect(o).contains("I am a confirm alert")
        })
    })
    it.skip("simple prompt box" , () =>{
        cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
       cy.windows().then((data) =>{
             cy.stub(data , "prompt").returns('rahul')
       })
        cy.on('window:alert' , (s) =>{
             expect(s).contains("I prompt you")
        })
        cy.get('#promptexample').click()

    })
})