describe("Asian paints" , () =>{
      it("add to cart" , () =>{
          cy.visit("https://www.asianpaints.com/")
          cy.get(':nth-child(6) > .track_section > .iconTextLinks__text').click()
          href="https://www.asianpaints.com/online-shop/wall-stickers/149Collection/the-great-night-of-shiva.html"
          cy.get(':nth-child(1) > .track_section > .iconTextLinks__text').click()

          cy.get('.title-buyOnline').click()
          cy.get('#productPincode').click().type("400081")
          cy.get('.google-map-icon > a').click()
          cy.get('#addToCart').click()
          cy.get('.cart-items-dropdowb').click().should("contain" , "3000")
        //   cy.get('.header__main-container--logo > .isVisible-img--scroll').click()
        //   cy.get('#CartLogo > .iconLinks').click()
          
           
      })
})