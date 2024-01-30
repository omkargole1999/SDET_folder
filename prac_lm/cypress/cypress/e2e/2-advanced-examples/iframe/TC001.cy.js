
import 'cypress-iframe'
describe("jquery", () =>{
    //   it("Register" , () =>{
            
    //   })
      it.skip("TC001",() =>{
          cy.visit("https://jqueryui.com/droppable/")
          cy.frameLoaded('.demo-frame');
          cy.iframe().find('#draggable').then((t) =>{
                const frame_text = t.text();
                expect(frame_text).to.contains('Drag me to my target')
                cy.log(frame_text)
          })
        
      })

      it.only("drop me" , ()=>{
        cy.visit("https://jqueryui.com/droppable/")
          cy.frameLoaded('.demo-frame')
          cy.iframe().find('#droppable').then((f) =>{
                const drop_txt = f.text();
                expect(drop_txt).to.contains('Drop here')
                cy.log(drop_txt)
          });
          
      })
       
})