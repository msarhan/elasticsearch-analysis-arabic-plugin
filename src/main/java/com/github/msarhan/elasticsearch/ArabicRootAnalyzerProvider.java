package com.github.msarhan.elasticsearch;

import com.github.msarhan.lucene.ArabicRootExtractorAnalyzer;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractIndexAnalyzerProvider;

/**
 * @author Mouaffak A. Sarhan
 */
public class ArabicRootAnalyzerProvider extends AbstractIndexAnalyzerProvider<ArabicRootExtractorAnalyzer> {

    private final ArabicRootExtractorAnalyzer analyzer;

    public ArabicRootAnalyzerProvider(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(name, settings);
        this.analyzer = new ArabicRootExtractorAnalyzer();
    }

    @Override
    public ArabicRootExtractorAnalyzer get() {
        return this.analyzer;
    }
}
