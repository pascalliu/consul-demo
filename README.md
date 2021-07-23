# consul-demo
This is a consul-demo for learning Spring Cloud Consul.
I created three micro-servers to try to register with Consul and realize the service discovery.
The server and server2 have the same functions.
Access the address "localhost/port/add?num=<num>" will get <num> + 1.
The client discovers and selects one of the services through Consul to complete the cumulative count.
