class parabank_repo{
      get_firstname( fname)
      {
        cy.get(':nth-child(1) > [width="20%"]').type(fname)
      }
      get_lastname(lname)
      {
        cy.get(':nth-child(2) > [width="20%"]').type(lname)
      }
      get_address(address)
      {
        cy.get(':nth-child(3) > [width="20%"]').type(address)

      }
      get_city(city)
      {
        cy.get(':nth-child(4) > [width="20%"]').type(city)
      }
      get_state(state)
      {
        cy.get(':nth-child(5) > [width="20%"]').type(state)
      }
      get_zip_code(zip)
      {
        cy.get(':nth-child(6) > [width="20%"]').type(zip)
      }
      get_phone_no(phone_no)
      {
        cy.get(':nth-child(7) > [width="20%"]').type(phone_no)
      }
      get_ssn(ssn)
      {
        cy.get(':nth-child(8) > [width="20%"]').type(ssn)
      }
      get_Username(username)
      {
        cy.get(':nth-child(10) > [width="20%"]').click().type(username)
      }
      get_password(password)
      {
        cy.get(':nth-child(11) > [width="20%"]').click().type(password)
      }
      get_Cpassword(password)
      {
        cy.get(':nth-child(12) > [width="20%"]').click().type(password)
      }
      
}
export {parabank_repo};