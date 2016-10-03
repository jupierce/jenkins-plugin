package com.openshift.jenkins.plugins.pipeline;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class Argument extends AbstractDescribableImpl<Argument> {

    protected final String value;

    @DataBoundConstructor
    public Argument(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<Argument> {
        public String getDisplayName() {
            return "Command argument";
        }
    }

}
