describe("alert" , () =>{
     it.skip("simple alert" , ()=>{
          cy.visit("https://letcode.in/alert")

          cy.get('#accept').click()
          cy.get('window:alert' , (t) =>{
               expect(t).contains("Hey ! Welcome to LetCode")

          })
     })

     it.skip("Confirm" , ()=>{
        cy.visit("https://letcode.in/alert")

        cy.get('#confirm').click()
        cy.on('window:confirm' , (t) =>{
             expect(t).contains("Hey !are you happy  with LetCode")

        })
    })

        
        it.skip("prompt message" , () =>{
            cy.visit("https://letcode.in/alert")
    
            cy.get('#prompt').click()
            cy.on('window:alert' , (t) =>{

                 expect(t).to.contains("prompt")
    
            })
        })
        it.only("Prompt Alert", ()=>{

            cy.visit("https://letcode.in/alert")
            
            cy.window().then((win)=>{
            cy.stub(win,'prompt').returns('Omkar')
            
            
            })
            cy.get('#prompt').click()
        })
    })


        
