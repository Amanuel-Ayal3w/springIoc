package com.itsc.ioc;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringIoCApplication}.
 */
@Generated
public class SpringIoCApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'springIoCApplication'.
   */
  public static BeanDefinition getSpringIoCApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringIoCApplication.class);
    beanDefinition.setInstanceSupplier(SpringIoCApplication::new);
    return beanDefinition;
  }
}
