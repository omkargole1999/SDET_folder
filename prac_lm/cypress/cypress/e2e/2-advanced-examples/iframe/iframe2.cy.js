import 'cypress-iframe'
describe("jquery2", () =>{
    //   it("Register" , () =>{
            
    //   })
      it("TC002",() =>{
          cy.visit("https://www.tutorialspoint.com/cypress/cypress_frames.htm")
          cy.frameLoaded('.library-cta');
        //   cy.iframe().find('#draggable').then((t) =>{
        //         const frame_text = t.text();
        //         expect(frame_text).to.contains('Drag me to my target')
        //         cy.log(frame_text)
          })
        })
