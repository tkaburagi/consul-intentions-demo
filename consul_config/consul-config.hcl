data_dir  = "/data/localdata"
log_level = "DEBUG"

datacenter = "dc1"

server = true

bootstrap_expect = 1
ui               = true

ui_config {
  enabled = true
  metrics_provider = "prometheus"
  metrics_proxy = {
    base_url = "http://10.5.0.9:9090"
  }
}

bind_addr   = "0.0.0.0"
client_addr = "0.0.0.0"

ports {
  grpc = 8502
}

connect {
  enabled = true
}

telemetry = {
  "prometheus_retention_time" = "3h"
}

enable_central_service_config = true

//config_entries {
//  bootstrap =
//  {
//    kind = "proxy-defaults"
//    name = "global"
//    config = {
//      "envoy_prometheus_bind_addr" = "0.0.0.0:9102"
//    }
//  }
//}