Kind = "service-router"
Name = "country-api"
Routes = [
  {
    match = {
      http = {
    path_prefix = "/api/japan"
      }
  }
    destination = {
      service = "japanapp"
    }
  },

  {
    match = {
      http = {
    path_prefix = "/api/france"
      }
  }
    destination = {
      service = "franceapp"
    }
  },
]