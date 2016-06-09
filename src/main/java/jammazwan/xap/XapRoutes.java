package jammazwan.xap;

import org.apache.camel.builder.RouteBuilder;

public class XapRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:xap").to("http://www.wired.com/").to("file://.?fileName=test.html").to("mock:assert");
	}
}
