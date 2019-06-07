package com.qa.containers;

import java.util.Set;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;

public class MyContainer {

	public static void main(String[] args) {
        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();

        cdiContainer.boot();

        BeanManager beanManager = cdiContainer.getBeanManager();

        Set<Bean<?>> beans = beanManager.getBeans(World.class);
        Bean<?> bean = beanManager.resolve(beans);

        World world = (World) beanManager.getReference(bean, World.class, beanManager.createCreationalContext(bean));

        System.out.println(world.run());

        cdiContainer.shutdown();
	}
}