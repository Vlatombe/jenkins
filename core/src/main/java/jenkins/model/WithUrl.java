package jenkins.model;

import jenkins.security.stapler.StaplerAccessibleType;

/**
 * A simple marker interface for objects with a URL.
 *
 * @since XXX
 */
@StaplerAccessibleType
public interface WithUrl {
    /**
     * Returns the path relative to the context root,
     * like "foo/bar/zot/". Note no leading slash but trailing slash.
     */
    String getUrl();
}
