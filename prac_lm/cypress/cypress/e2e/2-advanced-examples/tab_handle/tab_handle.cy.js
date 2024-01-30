describe("tc01" , () =>{
      it("tab handle" , () =>{
           cy.visit("https://the-internet.herokuapp.com/windows")
           cy.get('.example > a').invoke('removeAttr' , 'target').click() 
      })
})