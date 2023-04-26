package rs.raf.domaci5;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import rs.raf.domaci5.repositories.InMemoryPostRepository;
import rs.raf.domaci5.repositories.PostRepository;
import rs.raf.domaci5.services.PostService;
import rs.raf.domaci5.services.PostServiceImpl;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class PublicBlogConfig extends ResourceConfig {

    public PublicBlogConfig() {
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);
                this.bind(PostServiceImpl.class).to(PostService.class);
            }
        };

        register(binder);
        packages("rs.raf.domaci5.resources");
    }
}