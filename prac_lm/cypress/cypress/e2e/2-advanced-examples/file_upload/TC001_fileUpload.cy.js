import 'cypress-file-upload'

describe("TC001", () =>{
    //   it("Register" , () =>{
            
    //   })
      it("fILE UPLOAD",() =>{
          cy.visit("https://the-internet.herokuapp.com/upload")
          cy.wait(3000)
          const filepath = 'new_file.txt'
          cy.get('#file-upload').attachFile(filepath)
          cy.get('#file-submit').click()

          })
        
        })