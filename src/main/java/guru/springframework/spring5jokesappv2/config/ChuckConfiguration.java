package guru.springframework.spring5jokesappv2.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Java Based Bean configuration is skipped to XML based. This is done to understand how the
 * XML based configuration works as you can find it in older projects.
 * To Switch back, you need to:
 *  - remove @ImportResource annotation that refers to the XML that contains "ChuckNorrisQuotes" configuration
 *    from Spring5JokesAppV2Application
 *  - remove the XML that contains "ChuckNorrisQuotes"(chuck-config.xml)
 *  - Re-add @Configuration and @Bean annotations
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
