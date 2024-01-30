describe("Book flight" , ()=>{
       it("Book flight" , () =>{
              cy.visit("https://www.spicejet.com/")
              cy.get('[data-testid="travel-type-2"] > .css-76zvg2').click()
              cy.get('[data-testid="search-source-code"]').click()
              cy.get('[data-testid="auto-cmp-txt"]').type("Mumbai (BOM)")
              cy.get('[data-testid="home-auto-cmp-action-btn"]').click()
              cy.get('[data-testid="search-destination-code"]').click()
              cy.get('[data-testid="auto-cmp-txt"]').type("Delhi (DEL)")
              cy.get('.r-6koalj > .r-1awozwy > :nth-child(1)').click()
              cy.get('[data-testid="search-submit-btn"]').click()
       })
})