Kind = "ingress-gateway"
Name = "ingress-service"

Listeners = [
  {
    Port     = 7007
    Protocol = "http"
    Services = [
      {
        Name  = "hashicorpjapanapp"
        Hosts = ["10.5.0.8"]
      }
    ]
  }
]
